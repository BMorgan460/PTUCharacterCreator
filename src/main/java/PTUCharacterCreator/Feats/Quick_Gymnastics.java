package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Quick_Gymnastics extends Feature {
	{
		name = "Quick Gymnastics";
		tags = "[+Speed]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You hit with an Attack, you make a Jump, or you stand up from being Tripped Effect: You may may Shift 2 Meters. You dont count as Flanked or trigger Attacks of Opportunity until the end of your next turn. Additionally, if you activate this Feature, the triggering action does not provoke Attacks of Opportunity.";
		prereqs.put("Tumbler", -1);
	}
	public Quick_Gymnastics(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Tumbler");
	}
}