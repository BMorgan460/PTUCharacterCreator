package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Dance_Form extends Feature {
	{
		name = "Dance Form";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "Create and learn two Dance Moves, plus one more for each other Dancer Feature you have. Whenever you gain another Dancer Feature, create and learn another Dance Move. See Extras - Class Mechanics for Dance Move details.";
		prereqs.put("Dancer", -1);
	}
	public Dance_Form(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Dancer");
	}
}