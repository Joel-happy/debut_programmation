import random
import tkinter as tk
import math


def arbre(hauteur):
    for i in range(hauteur):
        espaces = hauteur - i - 1
        etoile = (2 * i) + 1
        print("=" * espaces + "*" * etoile + "=" * espaces)

    tronc = hauteur // 2
    for i in range(tronc):
        espaces = hauteur - 2
        etoile = 3
        print("=" * espaces + "*" * etoile + "=" * espaces)


def show_arbre():
    hauteur = int(entry_arbre.get())
    arbre(hauteur)


def aire_du_polygone():
    try:
        mesure_dun_cote = int(entry_polygone.get())
    except ValueError:
        print("vous avez entré une mauvaise valeur")
        return
    try:
        nombre_de_cote = int(entry_nombre.get())
    except ValueError:
        print("vous avez entré une mauvaise valeur")
        return
    aire = (nombre_de_cote * (mesure_dun_cote ** 2)) / (4 * math.tan(math.pi / nombre_de_cote))
    print(aire)


def show_polygone():
    aire_du_polygone()


def nombre_mystere():
    valeur_min = int(entry_min.get())  #l'utilisateur aura la possibilité de définir la marge du nombre mystere
    valeur_max = int(entry_max.get())
    nombre_machine = random.randrange(valeur_min, valeur_max + 1)
    tentative = 0

    print("Le nombre à trouver se trouve entre", valeur_min, "et", valeur_max)
    print("Vous avez droit à 10 tentatives")

    while tentative < 10:
        try:
            nombre_joueur = int(input("Entrez un nombre : "))
        except ValueError:
            print("Vous avez entré une mauvaise valeur")
        if nombre_joueur >= valeur_min and nombre_joueur <= valeur_max:
            if nombre_joueur > nombre_machine:
                tentative += 1
                print("Trop grand")
            elif nombre_joueur < nombre_machine:
                tentative += 1
                print("Trop petit")
            else:
                tentative += 1
                print("Bravo, le nombre est bien", nombre_machine, "vous avez réussi en", tentative, "tentative(s)")
                break
        else:
            print("Erreur, le nombre que vous avez rentré ne se trouve pas dans l'intervalle qui vous a été donné")
            print("Le nombre à trouver était", nombre_machine)


def show_nombre_mystere():
    nombre_mystere()


def on_select(value):
    if value == "Arbre":
        frame1.pack(fill="both", expand=True)
        frame2.pack_forget()
        frame3.pack_forget()
    elif value == "Polygone":
        frame2.pack(fill="both", expand=True)
        frame1.pack_forget()
        frame3.pack_forget()
    elif value == "Jeu du nombre mystère":
        frame3.pack(fill="both", expand=True)
        frame1.pack_forget()
        frame2.pack_forget()


root = tk.Tk()
root.title("Selectionneur")

var = tk.StringVar()
var.set("Arbre")

selector = tk.OptionMenu(root, var, "Arbre", "Polygone", "Jeu du nombre mystère",
                         command=lambda value: on_select(value))
selector.pack()

frame1 = tk.Frame(root)
frame2 = tk.Frame(root)
frame3 = tk.Frame(root)

label_arbre = tk.Label(frame1, text="Hauteur de l'arbre :")
label_arbre.pack()

entry_arbre = tk.Entry(frame1)
entry_arbre.pack()

button_arbre = tk.Button(frame1, text="Afficher l'arbre", command=show_arbre)
button_arbre.pack()

label_polygone = tk.Label(frame2, text="Mesure d'un côté :")
label_polygone.pack()

entry_polygone = tk.Entry(frame2)
entry_polygone.pack()

label_nombre = tk.Label(frame2, text="Nombre de côtés :")
label_nombre.pack()

entry_nombre = tk.Entry(frame2)
entry_nombre.pack()

button_polygone = tk.Button(frame2, text="Afficher l'aire du polygone", command=show_polygone)
button_polygone.pack()

label_min = tk.Label(frame3, text="Valeur minimale :")
label_min.pack()

entry_min = tk.Entry(frame3)
entry_min.pack()

label_max = tk.Label(frame3, text="Valeur maximale :")
label_max.pack()

entry_max = tk.Entry(frame3)
entry_max.pack()

button_nombre_mystere = tk.Button(frame3, text="Jouer au jeu du nombre mystère", command=show_nombre_mystere)
button_nombre_mystere.pack()

frame1.pack(fill="both", expand=True)

root.mainloop()
