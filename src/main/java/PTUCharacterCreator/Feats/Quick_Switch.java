package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Quick_Switch extends Feature {
	{
		name = "Quick Switch";
		tags = "";
		frequency = "2 AP - Free Action";
		effect = "Trigger: Your Pokemon Faints, or an opponent sends out a Pokemon Effect: You may return and send out a Pokemon as a Free Action. You may perform this Feature on your turn without a Trigger. Pokemon sent out by Quick Switch cannot trigger another trainers Quick Switch. When you swap Pokemon using Quick Switch, you do not lose a Pokemon turn.";
		prereqs.put("Acrobatics", 3);
		prereqs.put("Guile", 3);
	}
	public Quick_Switch(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Acrobatics",3) && t.checkSkillRank("Guile",3);
	}
}