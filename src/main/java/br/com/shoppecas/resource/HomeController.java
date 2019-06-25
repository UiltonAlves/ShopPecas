package br.com.shoppecas.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.shoppecas.models.Usuario;
import br.com.shoppecas.rni.UsuarioBCI;

@Controller
@Transactional
public class HomeController {
	
	@Autowired
	private UsuarioBCI daoUsuario;
	
	@RequestMapping("/")
	@Cacheable(value="home")
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		return modelAndView;
	}
	
	//cadastro do primeiro usuario.
		@ResponseBody
		@RequestMapping("/url-magica-maluca-alksdj2212244fljasdlfjaljs356252252dfjrkjakdjrijk2225225jailljr")
		public String urlMagicaMaluca() {
			
			Usuario usuario = new Usuario();
			
			usuario.setUsername("coloque aqui seu usuario");
			usuario.setAtivo(true);
			usuario.setSenha(new BCryptPasswordEncoder().encode("coloque aqui sua senha"));
			
//			ServidorEmail email = new ServidorEmail();
			
//			email.setAtivo(true);
//			email.setHost("smtp.gmail.com");
//			email.setUsername("coloque aqui seu email");
//			email.setPassword("coloque aqui sua senha");
//			email.setPort(587);
//			daoEmail.insert(email);
			
			daoUsuario.insert(usuario);
			
//			enviaEmail.enviarEmailUsuarioCadastrado(usuario);

			return "Url Mágica executada";
		}
	

	
}
