package fr.esir.lsi.aspect;

import exploitation.Ressource;
import fr.esir.lsi.aspect.ResourceAspectRessourceAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Ressource.class)
@SuppressWarnings("all")
public class ResourceAspect {
  public static void simulate(final Ressource _self) {
    _self_ = fr.esir.lsi.aspect.ResourceAspectRessourceAspectContext.getSelf(_self);
    _privk3_simulate(_self);
  }
  
  public static ResourceAspectRessourceAspectProperties _self_;
  
  protected static void _privk3_simulate(final Ressource _self) {
  }
}
