package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Corrosive_Blight extends Feature {
	{
		name = "Corrosive Blight";
		tags = "";
		frequency = "Daily x3 - Free Action";
		effect = "Trigger: Your Pokemon hits a foe with a Poison-Type Attack Effect: The target gains the Blight Condition for one full round. Blighted targets lose a Tick of Hit Points upon being hit by any attack. If the attack is Poison-Typed, the Blight effects duration is refreshed.";
		prereqs.put("Potent Venom", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public Corrosive_Blight(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Potent Venom");
	}
}