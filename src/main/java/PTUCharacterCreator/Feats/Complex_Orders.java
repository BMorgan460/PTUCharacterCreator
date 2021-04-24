package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Complex_Orders extends Feature {
	{
		name = "Complex Orders";
		tags = "";
		frequency = "At-Will - Shift Action";
		effect = "Trigger: You give [Orders] that have targets. Effect: You may choose a different Order to give to each Target. You must pay all AP costs and follow Frequency restrictions for all Orders used in this way.";
		prereqs.put("Commander", -1);
		prereqs.put("at least two Features with the [Orders] Tag that have targets", 0);
	}
	public Complex_Orders(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Commander");
	}
}