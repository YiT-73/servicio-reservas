from pydantic import BaseModel

class ReservaRequest(BaseModel):
    user_id: int
    funcion_id: int
    cantidad_boletos: int