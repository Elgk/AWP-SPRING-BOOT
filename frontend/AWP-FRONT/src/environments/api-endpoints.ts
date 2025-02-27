export const ApiEndpoints = {
    creditRequests: {
        list: '/requests',
        get: (id: number) => `/requests/{id}`,
        create: 'requests/create',
        update: (id: number) => `/requests/{id}`,
        delete: (id: number) => `/requests/{id}`,
    },
    clients: {
        list: '/clients',
    },
    users: {
        list: '/api/v1/users',
    },
}