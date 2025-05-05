from fastapi import APIRouter
from schemas.reserva_schema import ReservaRequest
from services import reservas_service

router = APIRouter()

@router.get("/")
def echo():
    return {"message": "Echo Test OK"}

@router.post("/reservas")
def crear_reserva(reserva: ReservaRequest):
    return reservas_service.crear_reserva(reserva)

@router.get("/reservas/usuario/{user_id}")
def obtener_reservas_usuario(user_id: int):
    return reservas_service.obtener_por_usuario(user_id)

@router.get("/reservas/funcion/{funcion_id}")
def obtener_por_funcion(funcion_id: int):
    return reservas_service.obtener_por_funcion(funcion_id)

@router.delete("/reservas/{reserva_id}")
def eliminar_reserva(reserva_id: int):
    return reservas_service.eliminar_reserva(reserva_id)