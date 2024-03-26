import math


def polygone():
    try:
        mesure_dun_cote = int(input("Entrez la mesure d'un côté"))
    except ValueError:
        print("vous avez entré une mauvaise valeur")
    try:
        nombre_de_cote = int(input("Entrez le nombre de côté"))
    except ValueError:
        print("vous avez entré une mauvaise valeur")
    aire_du_polygone = (nombre_de_cote * (mesure_dun_cote ** 2)) / (4 * math.tan(math.pi / nombre_de_cote))
    print(aire_du_polygone)

polygone()
