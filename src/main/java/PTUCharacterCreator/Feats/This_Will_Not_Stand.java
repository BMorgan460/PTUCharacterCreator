package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class This_Will_Not_Stand extends Feature {
	{
		name = "This Will Not Stand";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Trigger: Your Dragon-Type Pokemon takes a Critical Hit or Massive Damage Effect: Your Pokemon gains +1 Combat Stage in each of Attack, Special Attack, and Speed. This Will Not Stand may trigger only once per Scene per Pokemon.";
		prereqs.put("Tyrant's Roar", -1);
		prereqs.put("Type-Linked Skill at Master", 0);
	}
	public This_Will_Not_Stand(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Tyrant's Roar");
	}
}