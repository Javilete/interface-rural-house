package com.rural.house.lg.resource;

import com.rural.house.lg.annotations.Documentation;
import com.rural.house.lg.model.interfaces.Booking;
import org.eclipse.jetty.server.Response;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/booking")
@Documentation("Booking API")
public abstract class BookingResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/check")
    public Response checkReservation(Booking booking) {
        return checkReservationImpl(booking);
    }

    public abstract Response checkReservationImpl(Booking booking);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/submit")
    public Response submitReservation(Booking booking) {
        return submitReservationImpl(booking);
    }

    public abstract Response submitReservationImpl(Booking booking);
}
