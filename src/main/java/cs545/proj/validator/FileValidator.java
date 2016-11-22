package cs545.proj.validator;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import cs545.proj.domain.UploadedFile;

@Service
public class FileValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void validate(Object uploadedFile, Errors errors) {

	UploadedFile file = (UploadedFile) uploadedFile;

		if (file.getFile().getSize() == 0) {
			errors.rejectValue("file", "uploadForm.salectFile",
					"Please select a file!");
		}

	}

}
