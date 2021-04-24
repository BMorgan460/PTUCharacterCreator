package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Fight_On_and_On extends Feature {
	{
		name = "Fight On and On";
		tags = "[+HP]";
		frequency = "Daily - Free Action";
		effect = "Trigger: Your Hit Points are lowered to or below 0 while Enraged. Effect: You are not Fainted, you instead Faint upon reaching -50% of your Max Hit Points. If you have 5 or more injuries, you may use this Feature regardless of Frequency.";
		prereqs.put("Lessons in Rage & Pain", 0);
		prereqs.put("Combat", 4);
	}
	public Fight_On_and_On(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Combat",4);
	}
}