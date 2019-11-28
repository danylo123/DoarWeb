package doacao;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import usuario.Usuario;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Doacao.class)
public abstract class Doacao_ {

	public static volatile SingularAttribute<Doacao, String> statusDoacao;
	public static volatile SingularAttribute<Doacao, Date> dataEntrada;
	public static volatile SingularAttribute<Doacao, String> nomeDoacao;
	public static volatile SingularAttribute<Doacao, String> nomeDoador;
	public static volatile SingularAttribute<Doacao, Usuario> usuario;
	public static volatile SingularAttribute<Doacao, Integer> idDoacao;
	public static volatile SingularAttribute<Doacao, Date> dataSaida;
	public static volatile SingularAttribute<Doacao, String> descricaoProduto;

}

