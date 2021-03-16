package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Feature;
public class Ride_as_One extends Feature {
	{
		name = "Ride as One";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "While you are Mounted, you and your Mount each use the highest of each others Speed Evasion. If both you and your Mount have the same Speed Evasion, you instead each receive a +1 bonus to Speed Evasion. Whenever one of you receives Initiative, either of you may take your turn. When the next person would receive initiative, the person that did not take their turn then takes it.";
	}
	public Ride_as_One(){}
}