package br.com.shoppecas.infra;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import br.com.shoppecas.models.Usuario;

@Component
public class EnviarEmail {
	
//	@Autowired
//	private MailSender sender;
	
	public void enviarEmailUsuarioCadastrado(Usuario usuario) {
		
		SimpleMailMessage email = new SimpleMailMessage();
		
		email.setSubject("Usuario Cadastrado com suscesso");
		email.setFrom("uilnew18@gmail.com");
		email.setText("O usuario cadastrador e  " + usuario.getUsername());
		
//		sender.send(email);
	}
	
	
}
