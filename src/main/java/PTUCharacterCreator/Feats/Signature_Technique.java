package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Signature_Technique extends Feature {
	{
		name = "Signature Technique";
		tags = "";
		frequency = "At-Will - Extended Action";
		effect = "Target: Your Pokemon with at least 2 Tutor Points remaining Effect: The target loses 2 Tutor Points. Choose one Move on the Targets Move List. That Move becomes the targets Signature Technique, and you may apply one of the modifications listed below to the Move. The Move being modified must fit the category of the modification, and you must have the associated Training Feature to apply a modification. A Pokemon may only have one Signature Technique at a time. If you choose to teach a Pokemon a different Signature Technique, the old one is lost, and 1 Tutor Point is refunded. 1 Tutor Point is also refunded if the Pokemon ever forgets a Signature Technique Move.  See Extras - Techniques / Talents / Lessons / Achievements / Manipulations for details. Signature Technique Modifications: »» Cone, Line, Burst, and Blast Moves: Scattershot, Shock and Awe, Vicious Storm »» Single Target Moves: Guarding Strike, Unbalancing Blow, Reliable Attack »» Damaging Moves: Alternative Energy, Bloodied Speed, Double Down »» Status Moves: Burst of Motivation, Surpreme Concentration, Double Curse";
		prereqs.put("Elite Trainer", -1);
		prereqs.put("Command", 5);
	}
	public Signature_Technique(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Elite Trainer") && t.checkSkillRank("Command",5);
	}
}