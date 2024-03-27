#include"Header.h"

int main() {

	int choix;
	do{
	cout << "Quel programme voulez vous lancer?" << endl<<"1-Polygone"<< endl<<"2-Nombre Mystere"<<endl<<"3-Arbre de noel"<<endl<<"(0 pour terminer)";
	cin >> choix;
	switch (choix){
		case 0:
			cout << "Fin du programme..." << endl;
			break;
		case 1:
			Polygone();
			continue;
		case 2:
			NombreMystere();
			continue;
		case 3:
			ArbreDeNoel();
			continue;
		default:
			cout << "Erreur! Vous avez entre une mauvaise valeur" << endl;
			continue;
	}
	} while (choix != 0);

	return 0;
}