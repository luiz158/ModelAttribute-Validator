package validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
// import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import models.Personne;

@Component
public class Validation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Personne.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Personne personne = (Personne) target;
		/*
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nom", "form.notEmpty.nom");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "prenom", "form.notEmpty.prenom");
		*/
		if (personne.getNom().length() < 3) errors.rejectValue("nom", "form.length.nom");
		if (personne.getPrenom().length() < 3) errors.rejectValue("prenom", "form.length.prenom");
	}
	
}