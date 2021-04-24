package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Equipment_Savant extends Feature {
	{
		name = "Equipment Savant";
		tags = "[+Speed] [5-15 Playtest]";
		frequency = "2 AP - Swift Action";
		effect = "Use or Equip an Item or piece of Equipment which would normally require a Standard Action to use or equip. You may not make an Attack with a Weapon this way - using other Items or Equipment that requires “Attacks” (such as Cap Cannons or Poke Balls) is acceptable.";
		prereqs.put("Backpacker", -1);
		prereqs.put("Survival", 5);
	}
	public Equipment_Savant(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Backpacker") && t.checkSkillRank("Survival",5);
	}
}