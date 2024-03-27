#include"Header.h"

int ArbreDeNoel() {
	int hauteur;
	cout << "Entrez la hauteur que vous desirez pour votre arbre " << endl;
	cin >> hauteur;
    for (int  i = 0; i < hauteur; i++)
    {
        cout << "";
    }
    for(int i=0;i<1;i++){


    }

    //partie inférieur

    for (int i = 0;i < 1;i++){ 
        for (int j = 0;j < hauteur + 0;j++){
            cout<<"=";
        }
        cout << "***";
        for (int j = 0;j < hauteur + 0;j++) {
            cout<<"=";
        }
    }
    
	return 0;
}