# TP4
## Exercice 5
	Redéfinir une méthode signifie que la sous-class modifie des méthodes héritées de la class mère par-dessus pour pouvoir personnalisé le comportement en fonction de leurs besoins.
	
## Exercice 6
	Il n'y a que 2 méthodes de vélo redefinies dans VeloElect, ces méthodes sont :
			- public String toString()
			- public double getPuissance(double FrequenceCoupsDePedale)
	Elles sont redéfinies pour adapter VeloElect.
	
## Exercice 7
	La notation @Override qui est placée au-dessus de la méthode "public String toString()" dans VeloElect signifie que le compilateur va réécrire la méthode héritée de la class mère.
	
## Exercice 8
	En retirant le override, le code Java devrait marcher car Java ne nous force pas à l'avoir, cependant il y a des risques d'erreurs plus ou moins difficiles à régler. Faisant le test avec la VeloElect.