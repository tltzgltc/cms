package project.cms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.cms.entity.Atividade;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {
  String login;
  String email;
  String nome;
  String afiliacao;
  List<String> favoritos;
}
