package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Field_Clinic_915_Playtest extends Edge {
	{
		name = "Field Clinic [9-15 Playtest]";
		effect = "Whenever your party Sets Up Camp, you may spend $200 worth of Medical Scrap to set up a Field Clinic. While using the Field Clinic, all members gain the following benefits, »» You may spend $300 of Medical Scrap to create and apply a Bandage or use a First Aid Kit »» If you have the Nurse Feature, you may spend $300 to activate it without Draining AP. »» Potions, Super Potions, Hyper Potions, Full Restores, Revives, Energy Powders, and Energy Roots used in this area heal their target an additional 5 Hit Points.";
		prereqs.put("Med Edu", 4);
	}
	public Field_Clinic_915_Playtest(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Med Edu",4) && true;
	}
}