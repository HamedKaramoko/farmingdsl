package fr.esir.lsi.aspect;

import exploitation.Culture;
import fr.esir.lsi.aspect.CultureAspectCultureAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class CultureAspectCultureAspectContext {
  public final static CultureAspectCultureAspectContext INSTANCE = new CultureAspectCultureAspectContext();
  
  public static CultureAspectCultureAspectProperties getSelf(final Culture _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.esir.lsi.aspect.CultureAspectCultureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Culture, CultureAspectCultureAspectProperties> map = new java.util.HashMap<exploitation.Culture, fr.esir.lsi.aspect.CultureAspectCultureAspectProperties>();
  
  public Map<Culture, CultureAspectCultureAspectProperties> getMap() {
    return map;
  }
}
