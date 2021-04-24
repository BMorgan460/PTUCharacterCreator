package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Emergency_Repairs extends Edge {
	{
		name = "Emergency Repairs";
		effect = "You may repair vehicles as a standard action by making a Technology Education roll. You pay the amount of your roll and repair that much Hit Point damage to the vehicle. If the vehicle has any Breaches you may Patch one of them. Patched Breaches no longer count towards Breach Security but still count toward Breach Capacity.";
		prereqs.put("Tech Edu", 3);
	}
	public Emergency_Repairs(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Tech Edu",3) && true;
	}
}