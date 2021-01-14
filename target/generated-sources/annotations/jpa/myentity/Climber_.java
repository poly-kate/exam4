package jpa.myentity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Climber.class)
public abstract class Climber_ extends jpa.myentity.BaseIdentify_ {

	public static volatile SingularAttribute<Climber, String> address;
	public static volatile SingularAttribute<Climber, String> name;
	public static volatile SingularAttribute<Climber, Integer> age;

	public static final String ADDRESS = "address";
	public static final String NAME = "name";
	public static final String AGE = "age";

}

