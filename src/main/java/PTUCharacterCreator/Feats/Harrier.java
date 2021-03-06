package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Harrier extends Feature {
	{
		name = "Harrier";
		tags = "[+Speed]";
		frequency = "At-Will - Free Action";
		effect = "Trigger: You hit a foe with a damaging Attack Effect: Until the end of your next turn, that foe is considered Flanked, is Slowed, and cannot take actions as Priority or Interrupt. Harrier may only be used on a foe once per Scene.";
		prereqs.put("Skirmisher", -1);
	}
	public Harrier(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Skirmisher");
	}
}