package tv.nosy.cli.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tv.nosy.cli.models.dao.custom.Achat;
import tv.nosy.cli.models.dao.custom.Box;
import tv.nosy.cli.models.services.custom.BoxImp;

@Controller
@RequestMapping(value = {"/list", "/crud"})
public class CRUDController {

    protected BoxImp bi;

    @RequestMapping(value = {"box"}, method = RequestMethod.GET)
    public String getListBox(Model model, HttpSession session){
        if(session.getAttribute("admin")==null){
            return "redirect:/";
        }
        try{
            List<Box> boxs = bi.findAll();
            model.addAttribute("boxs", boxs);
        }catch(Exception e){
            e.printStackTrace();
        }

        return "list/box";
    }

    @RequestMapping(value = {"insertBox"}, method = RequestMethod.POST)
    public String insertBox(HttpSession session){
        if(session.getAttribute("admin")==null){
            return "redirect:/";
        }
        Box nb = new Box(null, new Achat(), null);
        bi.save(nb);
        return "redirect:/list/box";
    }
}
