import React, { useState } from "react";
import axios from "axios";

const BusBookingForm = () => {
    const [form, setForm] = useState({
        name: "",
        pickUp: "",
        drop: "",
        ticketPrice: "" // spelling fixed
    });

    const [message, setMessage] = useState("");

    const handleChange = (e) => {
        setForm({
            ...form,
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        axios.post("http://localhost:8080/busBooking/save", form)
            .then(res => setMessage(res.data))
            .catch(err => {
                console.error(err);
                setMessage("Error booking ticket");
            });
    };

    return (
        <div style={{ maxWidth: "400px", margin: "auto" }}>
            <h2>Bus Ticket Booking</h2>
            <form onSubmit={handleSubmit}>
                <input name="name" placeholder="Name" value={form.name} onChange={handleChange} required /><br />
                <input name="pickUp" placeholder="Pick-Up" value={form.pickUp} onChange={handleChange} required /><br />
                <input name="drop" placeholder="Drop" value={form.drop} onChange={handleChange} required /><br />
                <input name="ticketPrice" type="number" placeholder="Ticket Price" value={form.ticketPrice} onChange={handleChange} required /><br />
                <button type="submit">Book Ticket</button>
            </form>
            <p>{message}</p>
        </div>
    );
};

export default BusBookingForm;
