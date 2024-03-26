import random

print()


def nombre_mystere():
    valeur_min=-100
    valeur_max=100
    nombre_machine=random.randrange(-100, 101)
    tentative=0
    
    print("Le nombre à trouver se trouve entre" ,valeur_min, "et",valeur_max)
    print("Vous avez droit à 10 tentatives")

    while tentative<10:
        try:
            nombre_joueur=int (input ("Entrez un nombre"))
        except ValueError:
            print("Vous avez entré une mauvaise valeur")
        if nombre_joueur>=valeur_min and nombre_joueur<=valeur_max:
            if nombre_joueur>nombre_machine:
                 tentative+=1
                 print("Trop grand")
            elif nombre_joueur<nombre_machine:
                 tentative+=1
                 print("Trop petit")
            else:
                tentative+=1
                print("Bravo, le nombre est bien" ,nombre_machine, "vous avez réussi en" ,tentative, "tentative(s)")
                break
        else:
            print("Erreur le nombre que vous avez rentré ne se trouvze pas dans l'intervalle qui vous a été mentionné")
            print("Le nombre à trouver était",nombre_machine)

nombre_mystere()