package br.com.shoppecas.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.shoppecas.models.Usuario;
import br.com.shoppecas.rni.UsuarioBCI;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioBCI daoUsuario;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView detalhesUsuario(@AuthenticationPrincipal Usuario usuario) {
				
		ModelAndView mv = new ModelAndView("usuarios/detalhesUsuario");
		mv.addObject("usuario",usuario);
	
		return mv;
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView atualizaUsuario(Usuario usuario) {
		
		daoUsuario.update(usuario);
		
		ModelAndView mv = new ModelAndView("usuarios/");
		
		mv.addObject("usuario", usuario);
	
		return mv;
	}	
}
