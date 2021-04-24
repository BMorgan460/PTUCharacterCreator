package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Power_Pirouette extends Feature {
	{
		name = "Power Pirouette";
		tags = "[+Speed]";
		frequency = "Scene x2 - Swift Action";
		effect = "Trigger: You perform a Dance Move Effect: Choose one effect: »» All adjacent targets are Confused. »» You gain +1 Combat Stage to a Stat of your choice not raised by the triggering Move. »» Destroy all Hazards within 5 meters, and remove Leech Seed, Trapped, and Stuck from yourself.";
		prereqs.put("Dance Form", -1);
		prereqs.put("Acrobatics", 5);
	}
	public Power_Pirouette(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Dance Form") && t.checkSkillRank("Acrobatics",5);
	}
}