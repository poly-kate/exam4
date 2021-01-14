package jpa.myentity;

import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Group.class)
public abstract class Group_ extends jpa.myentity.BaseIdentify_ {

	public static volatile SingularAttribute<Group, LocalDate> date;
	public static volatile SingularAttribute<Group, Integer> duration;
	public static volatile ListAttribute<Group, Climber> climbers;
	public static volatile SingularAttribute<Group, Mountain> mount;
	public static volatile SingularAttribute<Group, Boolean> status;

	public static final String DATE = "date";
	public static final String DURATION = "duration";
	public static final String CLIMBERS = "climbers";
	public static final String MOUNT = "mount";
	public static final String STATUS = "status";

}

