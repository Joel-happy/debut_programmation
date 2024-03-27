#include"Header.h"



	int Polygone() {
		int NombreDeCote;
		float MesureDunCote;
		double x, AireDuPolygone;
		const double M_PI = 3.14159265358979323846;
		
		cout << "Entrez la mesure des cotes " << endl;
		cin >> MesureDunCote;
		cout << "Entrez le nombre de cote" << endl;
		cin >> NombreDeCote;
		x = 180 * ((M_PI) /180);
		AireDuPolygone = (NombreDeCote * MesureDunCote * MesureDunCote) / (4 * tan((x/NombreDeCote)));
		cout << "L'aire de votre polygone est de " << AireDuPolygone << "m²" << endl;
		return 0;
	}
