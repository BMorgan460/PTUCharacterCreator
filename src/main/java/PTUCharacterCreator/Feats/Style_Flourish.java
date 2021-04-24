package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Style_Flourish extends Feature {
	{
		name = "Style Flourish";
		tags = "[Branch]";
		frequency = "1 AP - Free Action:";
		effect = "Trigger: Your Pokemon uses a Move of your Chosen Type Contest Effect: Re-Roll all dice that result in 1s. This effect may only be used once per Contest. Battle Effect: The target gains +1 CS in the Stat corresponding to your chosen Contest Type, after the Move and all effects have been resolved. This may only affect a target once per Scene.";
		prereqs.put("3 Style Expert Features", 0);
	}
	public Style_Flourish(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Style Expert");
	}
}