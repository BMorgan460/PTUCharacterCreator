package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shield_Bearer extends Feature {
	{
		name = "Shield Bearer";
		tags = "[+Defense]";
		frequency = "1 AP - Swift Action";
		effect = "You may immediately ready a Shield, and do not become Slowed as a result. You may choose to grant an adjacent Ally the Evasion and Damage Reduction bonuses from your shield instead of gaining them yourself, but these bonuses only apply as long as the ally remains adjacent to you. If you do and the ally Shifts, you may Shift alongside your ally as a Shift Action Interrupt. This cannot cause you to shift more than your normal Movement.";
		prereqs.put("Stalwart Bastion", -1);
	}
	public Shield_Bearer(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Stalwart Bastion");
	}
}