from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware
from routes.routes_reserva import router as reservas_router

app = FastAPI()

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

app.include_router(reservas_router)