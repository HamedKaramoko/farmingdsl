package fr.esir.lsi.aspect;

import exploitation.Ressource;
import fr.esir.lsi.aspect.ResourceAspectRessourceAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ResourceAspectRessourceAspectContext {
  public final static ResourceAspectRessourceAspectContext INSTANCE = new ResourceAspectRessourceAspectContext();
  
  public static ResourceAspectRessourceAspectProperties getSelf(final Ressource _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.esir.lsi.aspect.ResourceAspectRessourceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Ressource, ResourceAspectRessourceAspectProperties> map = new java.util.HashMap<exploitation.Ressource, fr.esir.lsi.aspect.ResourceAspectRessourceAspectProperties>();
  
  public Map<Ressource, ResourceAspectRessourceAspectProperties> getMap() {
    return map;
  }
}
