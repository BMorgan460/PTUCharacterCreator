package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Camouflage extends Move {
	{
		name = "Camouflage";
		effect = "The user changes their Type to match the field. Forests and grassy areas change the user into a Grass Type. Watery areas change the user into a Water Type. Caves and Mountains could change the user into a Rock or Ground Type. An icy terrain would turn the user into an Ice Type. A building may change the user into a Steel or Normal Type. Weather affects what Type the user becomes. Use common sense, if you are having difficult determining what Type the user should become, consult the GM. *Grants Blender";
		damageBase = 0;
		AC = 0;
		frequency = "EOT";
		range = "Self";
		type = "Normal";
		category = "Status";
	}
	public Camouflage(){}
}