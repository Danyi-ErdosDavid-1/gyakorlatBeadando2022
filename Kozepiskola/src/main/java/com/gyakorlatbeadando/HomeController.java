package com.gyakorlatbeadando;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.security.Principal;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private JelentkezoRepo jelentkezoRepo;
    @Autowired
    private JelentkezesRepo jelentkezesRepoRepo;
    @Autowired
    private KepzesRepo kepzesRepo;
    @Autowired
    private UzenetRepo uzenetRepo;
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("reg", new User());
        return "index";
    }
    @GetMapping("/home")
    public String user(Model model) {
        return "user";
    }
    @GetMapping("/gallery")
    public String gallery(Model model) {
        return "gallery";
    }
    @GetMapping("/admin/home")
    public String admin() {
        return "admin";
    }
    @GetMapping("/regisztral")
    public String greetingForm(Model model) {
        model.addAttribute("reg", new User());
        return "regisztral";
    }
    @PostMapping("/regisztral_feldolgoz")
    public String Regisztráció(@ModelAttribute User user, Model model) {
        for(User felhasznalo2: userRepo.findAll())
            if(felhasznalo2.getEmail().equals(user.getEmail())){
                model.addAttribute("uzenet", "A regisztrációs email már foglalt!");
                return "reghiba";
            }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Role role = new Role();
        role.setId(3); role.setName("ROLE_USER");
        List<Role> rolelist = new ArrayList<Role>();
        rolelist.add(role);
        user.setRoles(rolelist);
        userRepo.save(user);
        model.addAttribute("id", user.getId());
        return "regjo";
    }
    @GetMapping("/kozepiskola")
    public String kozepiskola(Model model) {
        List<List<String>> rowListData = new ArrayList<List<String>>();
        List<String> rowData;
        for(Jelentkezo jelentkezo : jelentkezoRepo.findAll()) {
            rowData = new ArrayList<String>();
            if(jelentkezo.getJelentkezesList().size() == 0) {
                rowData.add(jelentkezo.getId()+"");
                rowData.add(jelentkezo.getNev());
                rowData.add(jelentkezo.getNem());
                rowData.add("");
                rowData.add("");
                rowData.add("");
                rowData.add("");
                rowData.add("");
                rowData.add("");
                rowData.add("");
                rowListData.add(rowData);
            }
            for(Jelentkezes jelentkezes : jelentkezo.getJelentkezesList()) {
                rowData.add(jelentkezo.getId()+"");
                rowData.add(jelentkezo.getNev());
                rowData.add(jelentkezo.getNem());
                rowData.add(jelentkezes.getId()+"");
                rowData.add(jelentkezes.getSorrend()+"");
                rowData.add(jelentkezes.getSzerzett()+"");
                Kepzes kepzes = jelentkezes.getKepzesid();
                rowData.add(kepzes.getId()+"");
                rowData.add(kepzes.getNev());
                rowData.add(kepzes.getFelveheto()+"");
                rowData.add(kepzes.getMinimum()+"");
                rowListData.add(rowData);
                rowData = new ArrayList<String>();
            }
        }
        model.addAttribute("rowListData", rowListData);
        return "haromtablabol";
    }
    @GetMapping("/uzenetkuldes")
    public String urlapForm(Model model) {
        model.addAttribute("uzenet", new Uzenet());
        return "urlap";
    }
    @PostMapping("/eredmeny")
    public String urlapSubmit(@Valid @ModelAttribute Uzenet uzenet, BindingResult bindingResult, Model model, Principal principal) throws ParseException {
        if (bindingResult.hasErrors()) {
            return "urlap";
        }
        String sender = "";
        if(principal == null) {
            sender = "Vendég";
        } else {
            sender = principal.getName();
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Uzenet ujUzenet = new Uzenet(uzenet.getId(), uzenet.getContent(), dtf.format(now), sender);
        uzenetRepo.save(ujUzenet);
        model.addAttribute("eredmeny", uzenet);
        return "eredmeny";
    }
}
