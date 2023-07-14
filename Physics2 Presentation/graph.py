import numpy
import pandas
from plotly import express


def make_graph(
        title: str,
        x: numpy.ndarray,
        y: numpy.ndarray,
        v: numpy.ndarray,
        vx: numpy.ndarray,
        vy: numpy.ndarray,
        angle: numpy.ndarray,
        time: numpy.ndarray
):
    dff = pandas.DataFrame({
        "X": x,
        "Y": y,
        "V": v,
        "Vx": vx,
        "Vy": vy,
        "Angle": angle,
        "Time": time
    })

    fig = express.line(
        dff,
        x="X",
        y="Y",
        hover_data=["X", "Y", "V", "Vx", "Vy", "Angle", "Time"]
    )
    fig.update_layout(
        title=dict(
            text=title,
            font=dict(size=30),
            x=0.5
        )
    )
    fig.show()
