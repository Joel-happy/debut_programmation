#include"Header.h"
//#include <cstdlib>
#include <random>

//la fonction random 
random_device rd;
mt19937 gen(rd());

int random(int low, int high)
{
	uniform_int_distribution<> dist(low, high);
	return dist(gen);
}


int NombreMystere() {
	int NombreMachine =random(-100, 100);
	int NombreUtilisateur;
	int tentative = 0;
	const int VALEUR_MAX = 100;
	const int VALEUR_MIN = -100;
	cout << "NOMBRE MYSTERE" << endl << " Le nombre a trouver est entre " << VALEUR_MIN << " et " << VALEUR_MAX << endl << "Vous avez droit a 10 tentatives " << endl; 
	

	while (tentative < 10)
	{
		cout << " Entrez un nombre " << endl;
		cin >> NombreUtilisateur;

		if (NombreUtilisateur >= VALEUR_MIN && NombreUtilisateur <= VALEUR_MAX)
		{
			if(NombreUtilisateur > NombreMachine)
			{
				tentative++;
				cout << "Trop grand" << endl;
			}
			else if (NombreUtilisateur < NombreMachine)
			{
				tentative++;
				cout << "Trop petit" << endl;
			}
			else
			{
				tentative++;
				cout << "Bravo,le nombre a trouver est bien " << NombreMachine << " Vous avez gagne en " << tentative << " coup(s)" << endl;
				break;
			}

		}
		else
		{
			cout << "Erreur! " << NombreUtilisateur << " que vous avez entre ne se trouve pas dans l'intervalle mentionne plus haut" << endl;
		}
	}
	cout << "Le nombre a trouver etait " << NombreMachine << endl;
	return NombreMachine;
}