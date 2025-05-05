import mysql.connector
from schemas.reserva_schema import ReservaRequest

# Configura tu conexión
DB_CONFIG = {
    "host": "172.31.22.204",
    "port": "8005",
    "user": "root",
    "password": "utec",
    "database": "bd_cine"
}

def crear_reserva(reserva: ReservaRequest):
    db = mysql.connector.connect(**DB_CONFIG)
    cursor = db.cursor()
    sql = "INSERT INTO reservas (user_id, funcion_id, cantidad_boletos) VALUES (%s, %s, %s)"
    cursor.execute(sql, (reserva.user_id, reserva.funcion_id, reserva.cantidad_boletos))
    db.commit()
    cursor.close()
    db.close()
    return {"message": "Reserva creada correctamente"}

def obtener_por_usuario(user_id: int):
    db = mysql.connector.connect(**DB_CONFIG)
    cursor = db.cursor()
    cursor.execute("SELECT * FROM reservas WHERE user_id = %s", (user_id,))
    result = cursor.fetchall()
    cursor.close()
    db.close()
    return {"reservas": result}

def obtener_por_funcion(funcion_id: int):
    db = mysql.connector.connect(**DB_CONFIG)
    cursor = db.cursor()
    cursor.execute("SELECT * FROM reservas WHERE funcion_id = %s", (funcion_id,))
    result = cursor.fetchall()
    cursor.close()
    db.close()
    return {"reservas": result}

def eliminar_reserva(reserva_id: int):
    db = mysql.connector.connect(**DB_CONFIG)
    cursor = db.cursor()
    cursor.execute("DELETE FROM reservas WHERE id = %s", (reserva_id,))
    db.commit()
    cursor.close()
    db.close()
    return {"message": "Reserva eliminada"}