package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Style_Entrainment extends Feature {
	{
		name = "Style Entrainment";
		tags = "[Branch]";
		frequency = "1 AP - Swift Action, Priority (Limited)";
		effect = "Target: Your Pokemon Effect: Your Pokemon gains one of the following Abilities corresponding to your chosen Contest Stat for the rest of the Scene, even if it is switched out. Style Entrainment may only grant one Ability to a Pokemon at a time. If it is used a second time on the same target, it replaces the first granted Ability. »» Beauty gives Gentle Vibe or Serene Grace »» Cool gives Defiant or Sniper »» Cute gives Cute Charm or Cute Tears »» Smart gives Analytic or Anticipation »» Tough gives Sturdy or Intimidate";
		prereqs.put("4 Style Expert Features", 0);
	}
	public Style_Entrainment(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Style Expert");
	}
}