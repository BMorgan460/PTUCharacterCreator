package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Menace extends Feature {
	{
		name = "Menace";
		tags = "[+Defense]";
		frequency = "At-Will - Swift Action";
		effect = "Trigger: You hit a foe with the Terrorize Manipulation Effect: Until their next turn, the target has their Initiative lowered to 0. For one full round, attacks against them cause them to Flinch on 17+ or have their existing Flinch Range increased by +4.";
		prereqs.put("Roughneck", -1);
	}
	public Menace(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Roughneck");
	}
}