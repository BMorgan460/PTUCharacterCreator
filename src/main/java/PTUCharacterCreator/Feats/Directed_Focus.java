package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Directed_Focus extends Feature {
	{
		name = "Directed Focus";
		tags = "";
		frequency = "Static";
		effect = "Whenever your Pokemon with the Exploit or Tolerance Ability are targeted by [Orders], deal Super- Effective Damage, or take Super-Effective Damage, they gain +1 Momentum after all effects of the Move or Order are resolved.";
		prereqs.put("Effective Methods", -1);
	}
	public Directed_Focus(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Effective Methods");
	}
}