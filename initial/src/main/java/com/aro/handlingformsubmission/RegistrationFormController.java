package com.aro.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.aro.handlingformsubmission.IEnvironmentService;

@Controller
public class RegistrationFormController {
	
	@Autowired
    private IEnvironmentService environmentService;

  @GetMapping("/registrationForm")
  public String registrationForm(Model model) {
    model.addAttribute("registrationForm", new RegistrationForm());
    return "registrationForm";
  }

  @PostMapping("/registrationForm")
  public String greetingSubmit(@ModelAttribute RegistrationForm registrationForm, Model model) {
    model.addAttribute("registrationForm", registrationForm);
    return "registrationStatus";
  }
  
  @ModelAttribute("envType")
  public String getEnvType() {

      return environmentService.getEnvironmentType();
  }

}