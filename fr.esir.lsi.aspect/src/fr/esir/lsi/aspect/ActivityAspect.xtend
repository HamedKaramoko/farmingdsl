package fr.esir.lsi.aspect

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activity.Activity
import exploitation.Culture
import exploitation.Elevage

@Aspect (className=Activity)
class ActivityAspect {
	
	def simulate(){
		val atelier = _self.atelier
		 switch atelier {
		 	Culture : test_culture(_self, atelier)
		 	Elevage : test_elevage(_self, atelier)
		 	default : false
		 }
	}
	
	def test_culture(Culture culture){
		val cereal = culture.cereals
		switch (cereal) {
			case CORN : test_mais(_self)
			case WHEAT: test_wheat(_self)
			case SORGHUM : test_sorghum(_self)
			default : true
		}
	}
	
	def test_elevage(Elevage elevage){
		val animal = elevage.animals
		switch (animal) {
			case BOVIN : test_bovin(_self)
			case OVIN: test_ovin(_self)
			default : true
		}
	}
	
	def test_bovin(){
		val name = _self.activités
		switch (name) {
			case ALIMENTATION : test_alimentation(_self)
			case TRAITE : test_traite(_self)
			case SURVEILLANCE_AGNELAGE : test_surveillance_a(_self)
			case SURVEILLANGE_VELAGE : test_surveillance_v(_self)
			default : true
		}
	}
		
	
	def test_ovin(){
		
	}
	
	def test_wheat() {
		val name = _self.activités
		switch (name) {
			case LABOUR : test_labour(_self)
			case SEMIS : test_semis(_self)
			case IRRIGATGION : test_irrigation(_self)
			case RECOLTE : test_recolte(_self)
			case FERTILISATION : test_fertilisation(_self)
			default : true
		}
	}
	
	
	def test_alimentation(){
		
	}
	
	def test_traite(){
		
	}
	
	def test_surveillance_a(){
		
	}
	
	def test_surveillance_v(){
		
	}
	
	def test_sorghum() {
		
	}
	
	def test_mais(){
		
	}
	
	def test_labour(){
		val deb = _self.debut
		val fin = _self.fin
		val rules = _self.rule		
	}
	
	def test_semis(){
		
	}
	
	def test_irrigation(){
		
	}
	
	def test_recolte(){
		
	}
	
	def test_fertilisation(){
		
	}
}