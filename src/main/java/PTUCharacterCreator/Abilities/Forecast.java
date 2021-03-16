package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Forecast extends Ability {
	{
		name = "Forecast";
		freq = "Static";
		effect = "Trigger: \nEffect: The user's Type changes depending on the weather. It changes to Fire Type if it is Sunny, Ice Type if it is Hailing, Water Type if it is Rainy, and Rock Type if there is a Sandstorm. It returns to Normal Type if it is in normal weather or foggy weather. If there are multiple Weather Effects on the field, choose one type for the user to be that corresponds with an existing Weather Effect.";
	}
	public Forecast(){}
}