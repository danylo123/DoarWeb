package usuario;

import estabelecimento.Estabelecimento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, String> nomeUsuario;
	public static volatile SingularAttribute<Usuario, Estabelecimento> estabelecimento;
	public static volatile SingularAttribute<Usuario, Integer> idUsuario;
	public static volatile SingularAttribute<Usuario, String> cpfUsuario;
	public static volatile SingularAttribute<Usuario, String> emailUsuario;
	public static volatile SingularAttribute<Usuario, String> senhaUsuario;

}

